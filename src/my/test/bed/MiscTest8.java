package my.test.bed;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * Created by vyakovlev on 3/18/17.
 */

public class MiscTest8 {



    @Test
    public void printInfo() {
        List<StrategySpecification> strategies = new ArrayList<>();

        boolean verbose = true;
        final String strategyNamesDelimiter = ", ";
        final String strategyDescriptionsDelimiter = verbose ? "; " : ", ";
        final String typeNameDelimiter = ": ";

        strategies.add(new StrategySpecification.Builder().setType("type1").setName("name1").build());
        strategies.add(new StrategySpecification.Builder().setType("type1").setName("name1").build());
        strategies.add(new StrategySpecification.Builder().setType("type1").setName("name1").build());
        strategies.add(new StrategySpecification.Builder().setType("type1").setName("name2").build());
        strategies.add(new StrategySpecification.Builder().setType("type1").setName("name3").build());
        strategies.add(new StrategySpecification.Builder().setType("type2").setName("name2.1").build());


        Map<String, Set<String>> result = strategies.stream()
                .collect(groupingBy(StrategySpecification::getType,
                        mapping(StrategySpecification::getName, toSet())));

        Map<String, String> strategyTypesToTheirNames =

                strategies.stream().distinct()
                .collect(
                        groupingBy(StrategySpecification::getType,
                                mapping(StrategySpecification::getName,
                                        joining(strategyNamesDelimiter))));


        /*result.forEach((k, v) -> {
            String type = k;
            System.out.print(k + ": ");
            v.forEach(s -> System.out.print(s + ", "));
        });*/

       /* System.out.println("-----");




       result2.forEach((k, v) -> {
           //System.out.print(k + ": " + v + "; ");
           System.out.print(v + ", ");

       });*/


      /* String resultStr = result2.entrySet().stream().map((e) -> {
           return verbose ? e.getKey() + ":" + e.getValue() : e.getValue();
       }).collect(Collectors.joining(";"));*/


      String resultStr = verbose ?
              Joiner.on(strategyDescriptionsDelimiter)
                      .withKeyValueSeparator(typeNameDelimiter)
                      .join(strategyTypesToTheirNames) :
              Joiner.on(strategyDescriptionsDelimiter)
                      .join(strategyTypesToTheirNames.values());

       System.out.println(resultStr);
       Assert.assertTrue("incorrect output format",
               resultStr.equals("type2: name2.1; type1: [name1, name2, name3]"));






    }




}
