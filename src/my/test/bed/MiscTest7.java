package my.test.bed;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class MiscTest7 {

	
	public static void main(String[] args) {
		
		
		List<String> l1 = new ArrayList<>();
		
		l1.add("Mouse");
		l1.add("Cat");
		l1.add("Dog");
		l1.add("Fish");
		l1.add("Bird");
		
		l1.sort((s, s2) -> s.compareTo(s2));
		
		IntStream filledAndFiltered = IntStream.range(0, 10).map((j) -> j + 10);//.filter((a) -> a > 13);
		
		
		
		//filledAndFiltered.forEach((i) -> System.out.println(i));
		
		
		OptionalInt sumResult =  filledAndFiltered.reduce((x, y) -> x + y);
		
		System.out.println(sumResult.getAsInt());
		System.out.println(l1);
		
		Clock c = Clock.systemUTC();
		System.out.println(c.instant());
		
		System.out.println(LocalDateTime.ofInstant(c.instant(), ZoneId.systemDefault()));
		
		
		Builder<String>  sb = Stream.builder();
		sb.add("one").add("two").add("three").add("four");
		
		Stream<String> stringStream = sb.build();
		
		stringStream.map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));
		
		
		Comparator.comparing((q) -> 1);
		
		Stream<User> users = 
				Stream.of(new User("user3", "User Three"), new User("user1", "User One"), new User("user2", "User Two"));
		
		users.sorted(Comparator.comparing(User::getDisplayName))
			.forEach(u -> System.out.println(u.getDisplayName() + " " + u.getLastLogin()));
		
		System.out.println(1d/0d);
		
		Map<String, User> map1 = new HashMap<>();
		map1.put("Item1", new User("u1", "user one"));
		map1.put("Item2", new User("u2", "user two"));
		map1.put("Item3", new User("u3", "user three"));
		map1.put("Item4", new User("u4", "user four"));
		map1.put("Item5", new User("u5", "user five"));
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("[");
		map1.forEach((k, v) -> {
			sb2.append(k);
			sb2.append(":");
			sb2.append(v);
			sb2.append("; ");
		});
		
		sb2.append("]");
		System.out.println(sb2.toString());
		
		/*StringJoiner sj = new StringJoiner("", "[", "]");
		map1.forEach((k, v) ->{
			sj.add(k).add(":").add(v.toString()).add("; ");
		});
		
		System.out.println(sj);*/
		boolean verbose = true;
		String delimiter = verbose ? "; " : ", ";
		String toString = 
				map1.entrySet().stream()
				.map((e) -> {
					String key = e.getKey() == null ? "null" : e.getKey();
					String value = e.getValue() == null ? "null" : e.getValue().toString();
					String mapped = verbose ? key + ":" + value : value;
					return mapped;
				})
				.collect(Collectors.joining(delimiter, "[", "]"));
		
		
		System.out.println(toString);
		System.out.println(map1);
		
	}
	
	private static class User {
		private String userName;
		private String displayName;
		private Instant lastLogin = Clock.systemDefaultZone().instant();
		
		User (String userNameParam, String displayNameParam) {
			userName = userNameParam;
			displayName = displayNameParam;
		}
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userNameParam) {
			userName = userNameParam;
		}
		public String getDisplayName() {
			return displayName;
		}
		public void setDisplayName(String displayNameParam) {
			displayName = displayNameParam;
		}
		public Instant getLastLogin() {
			return lastLogin;
		}
		public void setLastLogin(Instant lastLoginParam) {
			lastLogin = lastLoginParam;
		}
		
		@Override
		public String toString() {
		
			return this.userName;
		}
	}
}
