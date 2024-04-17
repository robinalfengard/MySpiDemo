import provider.MetricBmiCalculator;
import provider.ImperialBmiCalculator;
import service.BmiCalculate;

module provider {
    requires service;
    provides BmiCalculate with ImperialBmiCalculator, MetricBmiCalculator;

}