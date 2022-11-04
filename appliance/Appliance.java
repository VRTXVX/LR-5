package appliance;

import command.Command;
public class Appliance {
    private String name;
    private String markAndModel;
    private double wattHour;
    private boolean status;
    private double workingHours;
    private String powerConsumptionClass;


    public Appliance() { }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMarkAndModel() { return markAndModel; }
    public void setMarkAndModel(String markAndModel) { this.markAndModel = markAndModel; }

    public double getWattHour() { return wattHour; }
    public void setWattHour(double wattHour) { this.wattHour = wattHour; }

    public boolean getStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    public double getWorkingHours() { return workingHours; }
    public void setWorkingHours(double workingHours) { this.workingHours = workingHours; }

    public String getPowerConsumptionClass() { return powerConsumptionClass; }
    public void setPowerConsumptionClass(String powerConsumptionClass) { this.powerConsumptionClass = powerConsumptionClass; }

    public double getConsumedEnergy() { return wattHour * workingHours; }

    @Override
    public String toString() { return ""; }
}