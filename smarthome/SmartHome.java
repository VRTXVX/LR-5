package smarthome;
import appliance.*;

import java.util.Arrays;
import java.util.Comparator;

public class SmartHome  {

    protected Appliance[] appliances;

    public SmartHome() { }

    public void addAppliance(Appliance appliance) {
        Appliance[] newAppliances = new Appliance[appliances.length + 1];

        System.arraycopy(appliances, 0, newAppliances, 0, appliances.length);
        newAppliances[appliances.length] = appliance;

        appliances = newAppliances;
    }
    public void removeAppliance(Appliance appliance) {
        Appliance[] newAppliances = new Appliance[appliances.length - 1];

        for (int i = 0, j = 0; i < appliances.length; i++) {
            if (appliances[i] != appliance) {
                newAppliances[j++] = appliances[i];
            }
        }

        appliances = newAppliances;
    }

    public void turnOnAllAppliances() {
        for (Appliance appliance : appliances) {
            appliance.setStatus(true);
        }
    }
    public void turnOffAllAppliances() {
        for (Appliance appliance : appliances) {
            appliance.setStatus(false);
        }
    }

    public void sortAppliancesByName() { Arrays.sort(appliances, Comparator.comparing(Appliance::getName)); }
    public void sortAppliancesByWattHour() { Arrays.sort(appliances, Comparator.comparing(Appliance::getWattHour)); }
    public void sortAppliancesByStatus() { Arrays.sort(appliances, Comparator.comparing(Appliance::getStatus)); }
    public void sortAppliancesByConsumedEnergy() { Arrays.sort(appliances, Comparator.comparing(Appliance::getConsumedEnergy)); }


    public double getTotalConsumedEnergy() {
        double totalConsumedEnergy = 0;
        for (Appliance appliance : appliances) {
            totalConsumedEnergy += appliance.getConsumedEnergy();
        }
        return totalConsumedEnergy;
    }

    public void changeCharacteristicAppliance() { }
}
