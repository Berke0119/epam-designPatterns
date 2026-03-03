package com.epam.creationaldesignpatterns.builder;

public class StoreItem {

    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    private StoreItem(BuilderStoreItem builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.shortDescription = builder.shortDescription;
        this.longDescription = builder.longDescription;
        this.stockAvailable = builder.stockAvailable;
        this.packagingType = builder.packagingType;
    }

    /*
    *
    * public BuilderStoreItem builder(){
        return BuilderStoreItem();
    }
    *
    * */


    public static class BuilderStoreItem{
        private String name;
        private Double price;
        private String shortDescription;
        private String longDescription;
        private Integer stockAvailable;
        private String packagingType;


        public BuilderStoreItem(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public BuilderStoreItem shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public BuilderStoreItem longDescription(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }

        public BuilderStoreItem stockAvailable(Integer stockAvailable) {
            this.stockAvailable = stockAvailable;
            return this;
        }

        public BuilderStoreItem packagingType (String packagingType) {
            this.packagingType = packagingType;
            return this;
        }

        public StoreItem build() {
            return new StoreItem(this);
        }


    }

}
