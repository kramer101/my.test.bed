package my.test.bed.modelmapper;

/**
 * Created by Vadym_Yakovlev on 6/5/2017.
 */
public interface MapperTest<S, T> {

    void map(S source, T target);

    void unMap(T source, S target);
}
