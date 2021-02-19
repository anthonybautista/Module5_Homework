public class FloridaFormatter implements DriversLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSoundexCode();
        String FFF = String.format("%03d",driversLicense.getFirstNameMiddleInitial());
        int YY = driversLicense.getBirthYear() % 100;
        String DDD = String.format("%03d",driversLicense.getBirthMonthDayGender());
        int N = driversLicense.getOverflow();

        return SSSS+"-"+FFF+"-"+YY+"-"+DDD+"-"+N;
    }
}
