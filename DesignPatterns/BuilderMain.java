package DesignPatterns;

class House{
    private String base;
    private String structure;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    public House(HouseBuilder builder){
        this.base=builder.base;
        this.structure=builder.structure;
        this.hasSwimmingPool=builder.hasSwimmingPool;
        this.hasGarden=builder.hasGarden;

    }
    public String toString(){
        return "House[Base="+base+" ,Structure="+structure+" ,Swimming Pool="+hasSwimmingPool+" ,Garden="+hasGarden+"]";
    }

    public static class HouseBuilder{
        private String base;
        private String structure;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public HouseBuilder(String base,String structure){
            this.base=base;
            this.structure=structure;
        }
        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool=hasSwimmingPool;
            return this;
        }
        public HouseBuilder setGarden(boolean hasGarden){
            this.hasGarden=hasGarden;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}

public class BuilderMain{
    public static void main(String[] args){
        House house=new House.HouseBuilder("Brick","Flat")
                .setSwimmingPool(false)
                .setGarden(true).build();
        System.out.println(house);
    }
}

