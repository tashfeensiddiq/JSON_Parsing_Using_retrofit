    package com.example.admin.retro;

    import com.google.gson.annotations.SerializedName;

    /**
     * Created by Admin on 2/19/2018.
     */

    public class info {

        private String id;
        private String name;
        private String symbol;
        private String rank;
        private String price_usd;
        private String price_btc;
        @SerializedName("24h_volume_usd")
        private String h_volume_usd;
        private String market_cap_usd;
        private String available_supply;
        private String total_supply;
        private String max_supply;
        private String percent_change_1h;
        private String percent_change_24h;
        private String percent_change_7d;
        private String last_updated;



        public info(String id, String name, String symbol, String rank, String price_usd, String price_btc,
                    String h_volume_usd, String market_cap_usd, String available_supply, String total_supply, String max_supply,
                    String percent_change_1h, String percent_change_24h, String percent_change_7d, String last_updated)
        {
            this.id = id;
            this.name = name;
            this.symbol = symbol;
            this.rank = rank;
            this.price_usd = price_usd;
            this.price_btc = price_btc;
            this.h_volume_usd = h_volume_usd;
            this.market_cap_usd = market_cap_usd;
            this.available_supply = available_supply;
            this.total_supply = total_supply;
            this.max_supply = max_supply;
            this.percent_change_1h = percent_change_1h;
            this.percent_change_24h = percent_change_24h;
            this.percent_change_7d = percent_change_7d;
            this.last_updated = last_updated;
            }

            public String getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public String getSymbol() {
                return symbol;
            }

            public String getRank() {
                return rank;
            }

            public String getPrice_usd() {
                return price_usd;
            }

            public String getPrice_btc() {
                return price_btc;
            }

        public String getH_volume_usd() {
            return h_volume_usd;
        }

            public String getMarket_cap_usd() {
                return market_cap_usd;
            }

        public String getAvailable_supply() {
            return available_supply;
        }

        public String getTotal_supply() {
            return total_supply;
        }

        public String getMax_supply() {
            return max_supply;
        }

        public String getPercent_change_1h() {
            return percent_change_1h;
        }

        public String getPercent_change_24h() {
            return percent_change_24h;
        }

        public String getPercent_change_7d() {
            return percent_change_7d;
        }

        public String getLast_updated() {
            return last_updated;
        }
    }
