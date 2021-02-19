public class WisconsinFormatter implements DriversLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSoundexCode();
        String FFF = String.format("%03d",driversLicense.getFirstNameMiddleInitial());
        String YY = String.valueOf(driversLicense.getBirthYear() % 100);
        String DDD = String.format("%03d",driversLicense.getBirthMonthDayGender());
        String N = String.format("%02d",driversLicense.getOverflow());

        return SSSS+"-"+FFF+YY.charAt(0)+"-"+YY.charAt(1)+DDD+"-"+N;
    }
}
