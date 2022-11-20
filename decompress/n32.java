import android.content.Context;
import android.bluetooth.BluetoothAdapter;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n32 extends rp1
{
    public boolean enabled;
    
    public n32(final String s) {
        long long1;
        try {
            long1 = Long.parseLong(s);
        }
        catch (final Exception ex) {
            long1 = 0L;
        }
        this.enabled = (long1 >= 0L);
    }
    
    @Override
    public final String a(final String s) {
        long long1;
        try {
            long1 = Long.parseLong(s);
        }
        catch (final Exception ex) {
            long1 = 0L;
        }
        long n;
        if (this.enabled) {
            n = long1 + 1L;
        }
        else {
            n = long1 - 1L;
        }
        return String.valueOf(n);
    }
    
    @Override
    public final boolean b(final v2c v2c) {
        final boolean enabled = this.enabled;
        final au8 au8 = (au8)v2c.D0;
        Label_0436: {
            if (au8.isBluetoothOn != null) {
                break Label_0436;
            }
            final Context i = ((vlj)v2c.E0).i;
            final String product = Build.PRODUCT;
            int n;
            if (!product.equals("sdk") && !product.equals("google_sdk") && !product.contains("sdk_x86") && !product.equals("vbox86p") && !product.contains("sdk_google_phone_x86")) {
                n = 0;
            }
            else {
                n = 1;
            }
            final String manufacturer = Build.MANUFACTURER;
            int n2 = 0;
            Label_0131: {
                if (!manufacturer.equals("unknown")) {
                    n2 = n;
                    if (!manufacturer.equals("Genymotion")) {
                        break Label_0131;
                    }
                }
                n2 = n + 1;
            }
            final String brand = Build.BRAND;
            int n3 = 0;
            Label_0162: {
                if (!brand.equals("generic")) {
                    n3 = n2;
                    if (!brand.contains("generic_x86")) {
                        break Label_0162;
                    }
                }
                n3 = n2 + 1;
            }
            final String device = Build.DEVICE;
            int n4 = 0;
            Label_0203: {
                if (!device.equals("generic") && !device.contains("generic_x86")) {
                    n4 = n3;
                    if (!device.equals("vbox86p")) {
                        break Label_0203;
                    }
                }
                n4 = n3 + 1;
            }
            final String model = Build.MODEL;
            int n5 = 0;
            Label_0244: {
                if (!model.equals("sdk") && !model.equals("google_sdk")) {
                    n5 = n4;
                    if (!model.contains("Android SDK built for x86")) {
                        break Label_0244;
                    }
                }
                n5 = n4 + 1;
            }
            final String hardware = Build.HARDWARE;
            int n6 = 0;
            Label_0285: {
                if (!hardware.equals("goldfish") && !hardware.equals("vbox86")) {
                    n6 = n5;
                    if (!hardware.equals("ranchu")) {
                        break Label_0285;
                    }
                }
                n6 = n5 + 1;
            }
            final String fingerprint = Build.FINGERPRINT;
            int n7 = 0;
            Label_0366: {
                if (!fingerprint.contains("generic/sdk/generic") && !fingerprint.contains("generic_x86/sdk_x86/generic_x86") && !fingerprint.contains("generic_x86_64/sdk_x86_64/generic_x86_64") && !fingerprint.contains("generic/google_sdk/generic") && !fingerprint.contains("generic/vbox86p/vbox86p") && !fingerprint.contains("Android/sdk_google_phone_x86_64/generic_x86_64")) {
                    n7 = n6;
                    if (!fingerprint.contains("Android/sdk_google_phone_x86/generic_x86")) {
                        break Label_0366;
                    }
                }
                n7 = n6 + 1;
            }
            while (true) {
                if (n7 > 3) {
                    break Label_0423;
                }
                try {
                    boolean b = false;
                    Label_0426: {
                        if (kn6.a(i, "android.permission.BLUETOOTH") == 0) {
                            final BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                                b = true;
                                break Label_0426;
                            }
                        }
                        b = false;
                    }
                    au8.isBluetoothOn = b;
                    if (enabled != ((au8)v2c.D0).isBluetoothOn) {
                        nza.x1(" \u2716\ufe0e Bluetooth signal not matching");
                        return false;
                    }
                    return true;
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public final int d() {
        return 15;
    }
}
