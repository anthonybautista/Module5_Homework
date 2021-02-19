public interface DriversLicenseFormatter {
    default String formatLicenseNumber(DriversLicense driversLicense) {
        return null;
    }

}
