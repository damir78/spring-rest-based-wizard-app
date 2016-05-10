package damir;

import javax.validation.constraints.Size;

public class CalculationData {

    @Size(min = 2)
    private String basicData;
    @Size(min = 2)
    private String forecast;
    @Size(min = 2)
    private String networkAccess;
    @Size(min = 2)
    private String calculation;
    @Size(min = 2)
    private String results;

    public String getBasicData() {
        return basicData;
    }

    public void setBasicData(String basicData) {
        this.basicData = basicData;
    }


    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getNetworkAccess() {
        return networkAccess;
    }

    public void setNetworkAccess(String networkAccess) {
        this.networkAccess = networkAccess;
    }

    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "UserData [basicData=" + basicData + ", forecast=" + forecast + ", networkAccess=" + networkAccess
                + ", calculation=" + calculation + ", results=" + results + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((basicData == null) ? 0 : basicData.hashCode());
        result = prime * result + ((calculation == null) ? 0 : calculation.hashCode());
        result = prime * result + ((forecast == null) ? 0 : forecast.hashCode());
        result = prime * result + ((networkAccess == null) ? 0 : networkAccess.hashCode());
        result = prime * result + ((results == null) ? 0 : results.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CalculationData other = (CalculationData) obj;
        if (basicData == null) {
            if (other.basicData != null)
                return false;
        } else if (!basicData.equals(other.basicData))
            return false;
        if (calculation == null) {
            if (other.calculation != null)
                return false;
        } else if (!calculation.equals(other.calculation))
            return false;
        if (forecast == null) {
            if (other.forecast != null)
                return false;
        } else if (!forecast.equals(other.forecast))
            return false;
        if (networkAccess == null) {
            if (other.networkAccess != null)
                return false;
        } else if (!networkAccess.equals(other.networkAccess))
            return false;
        if (results == null) {
            if (other.results != null)
                return false;
        } else if (!results.equals(other.results))
            return false;
        return true;
    }


}
