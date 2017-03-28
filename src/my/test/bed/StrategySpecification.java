package my.test.bed;

import java.util.List;
import java.util.Map;

/**
 * Created by vyakovlev on 3/24/17.
 */
public class StrategySpecification {
    private String name;
    private List<String> features;
    private Map<String, Object> params;
    private String type;

    private StrategySpecification() {
    }

    /**
     * Gets name of strategy.
     *
     * @return name of strategy
     */
    public String getName() {
        return name;
    }

    /**
     * Gets list of features, which are processed by the strategy.
     *
     * @return list of strategy features
     */
    public List<String> getFeatures() {
        return features;
    }

    /**
     * Gets params for the strategy.
     *
     * @return strategy params
     */
    public Map<String, Object> getParams() {
        return params;
    }

    public String getType() {
        return type;
    }

    public static class Builder {
        private String name;
        private List<String> features;
        private Map<String, Object> params;
        private String type;

        public StrategySpecification build() {
            StrategySpecification specification = new StrategySpecification();
            specification.name = name;
            specification.features = features;
            specification.params = params;
            specification.type = type;
            return specification;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFeatures(List<String> features) {
            this.features = features;
            return this;
        }

        public Builder setParams(Map<String, Object> params) {
            this.params = params;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }
    }
}
