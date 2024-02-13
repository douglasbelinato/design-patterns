package br.com.patterns.creational.builder.approach02.model;

public class Laptop {

    private final String cpu;
    private final String memory;
    private final String additionalInformation;

    public Laptop(String cpu, String memory, String additionalInformation) {
        this.cpu = cpu;
        this.memory = memory;
        this.additionalInformation = additionalInformation;
    }

    public static LaptopBuilder builder() {
        return new LaptopBuilder();
    }

    public static class LaptopBuilder {
        private String cpu;
        private String memory;
        private String additionalInformation;

        public LaptopBuilder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public LaptopBuilder withMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public LaptopBuilder withAdditionalInformation(String additionalInformation) {
            this.additionalInformation = additionalInformation;
            return this;
        }

        public Laptop build() {
            return new Laptop(cpu, memory, additionalInformation);
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                '}';
    }
}
