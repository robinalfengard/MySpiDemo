import service.BmiCalculate;

module consumer {
    requires service;
    requires provider;
    uses BmiCalculate;
}