package ex1_5;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < this.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[minIdx].getPopulation() > newArray[j].getPopulation()) {
                    minIdx = j;
                }
            }
            Country temp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < this.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[maxIdx].getPopulation() < newArray[j].getPopulation()) {
                    maxIdx = j;
                }
            }
            Country temp = newArray[maxIdx];
            newArray[maxIdx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < this.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < this.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] newArray = new AfricaCountry[this.length];
        int idx = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                newArray[idx] = (AfricaCountry) countries[i];
                idx++;
            }
        }
        if (idx == 0) {
            return null;
        }
        AfricaCountry[] result = new AfricaCountry[idx];
        System.arraycopy(newArray, 0, result, 0, idx);
        return result;
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] newArray = new AsiaCountry[this.length];
        int idx = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                newArray[idx] = (AsiaCountry) countries[i];
                idx++;
            }
        }
        if (idx == 0) {
            return null;
        }
        AsiaCountry[] result = new AsiaCountry[idx];
        System.arraycopy(newArray, 0, result, 0, idx);
        return result;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] newArray = new EuropeCountry[this.length];
        int idx = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                newArray[idx] = (EuropeCountry) countries[i];
                idx++;
            }
        }
        if (idx == 0) {
            return null;
        }
        EuropeCountry[] result = new EuropeCountry[idx];
        System.arraycopy(newArray, 0, result, 0, idx);
        return result;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] newArray = new NorthAmericaCountry[this.length];
        int idx = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                newArray[idx] = (NorthAmericaCountry) countries[i];
                idx++;
            }
        }
        if (idx == 0) {
            return null;
        }
        NorthAmericaCountry[] result = new NorthAmericaCountry[idx];
        System.arraycopy(newArray, 0, result, 0, idx);
        return result;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] newArray = new OceaniaCountry[this.length];
        int idx = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                newArray[idx] = (OceaniaCountry) countries[i];
                idx++;
            }
        }
        if (idx == 0) {
            return null;
        }
        OceaniaCountry[] result = new OceaniaCountry[idx];
        System.arraycopy(newArray, 0, result, 0, idx);
        return result;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] newArray = new SouthAmericaCountry[this.length];
        int idx = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                newArray[idx] = (SouthAmericaCountry) countries[i];
                idx++;
            }
        }
        if (idx == 0) {
            return null;
        }
        SouthAmericaCountry[] result = new SouthAmericaCountry[idx];
        System.arraycopy(newArray, 0, result, 0, idx);
        return result;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] desPopulous = sortByDecreasingPopulation();
        Country[] result = new Country[howMany];
        System.arraycopy(desPopulous, 0, result, 0, howMany);
        return result;

    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] ascPopulous = sortByIncreasingPopulation();
        Country[] result = new Country[howMany];
        System.arraycopy(ascPopulous, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] desArea = sortByDecreasingArea();
        Country[] result = new Country[howMany];
        System.arraycopy(desArea, 0, result, 0, howMany);
        return result;

    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] ascArea = sortByIncreasingArea();
        Country[] result = new Country[howMany];
        System.arraycopy(ascArea, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] desGdp = sortByDecreasingGdp();
        Country[] result = new Country[howMany];
        System.arraycopy(desGdp, 0, result, 0, howMany);
        return result;

    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] ascGdp = sortByIncreasingGdp();
        Country[] result = new Country[howMany];
        System.arraycopy(ascGdp, 0, result, 0, howMany);
        return result;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
