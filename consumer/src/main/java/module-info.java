import service.BmiCalculate;

module consumer {
    requires service;
    uses BmiCalculate;
}