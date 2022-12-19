package tema5.Ejemplo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Objects;
    public class Vehiculo {

        private String bastidor;
        private String matricula;
        private VehicuColor vehicuColor;
        private VehicuModelo vehicuModelo;
        private boolean disponible;
        private double tarifa;

        private static int contador = 0;

        public Vehiculo() {
            contador++;
            this.bastidor = String.valueOf(contador++);
            this.matricula = RandomStringUtils.randomNumeric(4) + RandomStringUtils.randomAlphabetic(3).toUpperCase();
            this.vehicuColor = VehicuColor.getAleatorio();
            this.vehicuModelo = VehicuModelo.modeloAleatorio();
        }


        public boolean isDisponible() {
            return disponible;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }

        public double getTarifa() {
            return tarifa;
        }

        public void setTarifa(double tarifa) {
            this.tarifa = tarifa;
        }


        public String getBastidor() {
            return bastidor;
        }

        public void setBastidor(String bastidor) {
            this.bastidor = bastidor;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public VehicuColor getColor() {
            return vehicuColor;
        }

        public void setColor(VehicuColor color) {
            this.vehicuColor = color;
        }

        public VehicuModelo getModelo() {
            return vehicuModelo;
        }

        public void setModelo(VehicuModelo modelo) {
            this.vehicuModelo = modelo;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 59 * hash + Objects.hashCode(this.bastidor);
            hash = 59 * hash + Objects.hashCode(this.matricula);
            hash = 59 * hash + Objects.hashCode(this.vehicuColor);
            hash = 59 * hash + Objects.hashCode(this.vehicuModelo);
            hash = 59 * hash + (this.disponible ? 1 : 0);
            hash = 59 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
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
            final Vehiculo other = (Vehiculo) obj;
            return Objects.equals(this.bastidor, other.bastidor);
        }


        @Override
        public String toString() {
            return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", color=" + vehicuColor + ", modelo=" + vehicuModelo + ", disponible=" + disponible + ", tarifa=" + tarifa + '}';
        }


    }

