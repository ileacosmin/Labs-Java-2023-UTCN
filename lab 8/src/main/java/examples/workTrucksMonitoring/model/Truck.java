/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.workTrucksMonitoring.model;

import lombok.*;

import java.util.Objects;

/**
 *
 * @author mihai.hulea
 */

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class Truck {
    @Getter @Setter
    private double latitude;
    @Getter @Setter
    private double longitudel;
    @Getter @Setter
    private String plateNumber;

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Truck other = (Truck) obj;
        if (!Objects.equals(this.plateNumber, other.plateNumber)) {
            return false;
        }
        return true;
    }
        
    
}
