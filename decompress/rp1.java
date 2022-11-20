import com.google.gson.Gson;
import java.util.HashMap;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rp1
{
    public static final int AIRPLANE_ID = 3;
    public static final int BATTERYCHARGINGSTATUS_ID = 12;
    public static final int BATTERYCHARGINGTYPE_ID = 13;
    public static final int BATTERYLEVEL_ID = 14;
    public static final int BLUETOOTH_ID = 15;
    public static final int DATACONNECTION_ID = 19;
    public static final int DEVICEDECISIONS_ID = 20;
    public static final int HEADPHONES_ID = 24;
    public static final int ORIENTATIONDISPLAY_ID = 37;
    public static final int RADIOSIGNAL_ID = 41;
    public static final int RINGERVOLUME_ID = 43;
    public static final int ROAMING_ID = 44;
    public static final int TIME_ID = 48;
    public static final int UNLOCK_ID = 49;
    public static final int WIFI_ID = 50;
    
    public static rp1 c(final int n, final String s) {
        if (n == 3) {
            return (rp1)new ew(s);
        }
        if (n == 19) {
            return (rp1)new w68(s);
        }
        if (n == 24) {
            return new bic(s);
        }
        if (n == 37) {
            return (rp1)new poj(s);
        }
        if (n == 41) {
            return (rp1)new owl(s);
        }
        if (n == 43) {
            return (rp1)new lzm(s);
        }
        if (n == 44) {
            return new c0n(s);
        }
        if (n == 49) {
            return (rp1)new pzv(s);
        }
        if (n == 50) {
            return (rp1)new tox(s);
        }
        switch (n) {
            default: {
                return null;
            }
            case 15: {
                return new n32(s);
            }
            case 14: {
                return new ws1(s);
            }
            case 13: {
                return (rp1)new vs1(s);
            }
            case 12: {
                return (rp1)new ss1(s);
            }
        }
    }
    
    public static boolean e(final String s, final String s2) {
        return Pattern.compile(s2, 2).matcher(s).matches();
    }
    
    public static HashMap<String, Long> f(final String s) {
        HashMap hashMap;
        try {
            hashMap = (HashMap)new Gson().d(s, new blv<HashMap<String, Long>>() {}.type);
        }
        catch (final Exception ex) {
            hashMap = null;
        }
        HashMap hashMap2 = hashMap;
        if (hashMap == null) {
            hashMap2 = new HashMap();
        }
        return hashMap2;
    }
    
    public String a(final String s) {
        return s;
    }
    
    public abstract boolean b(final v2c p0);
    
    public abstract int d();
    
    public static final class b
    {
        public long cb;
        public long cnb;
        public double maxb;
        public double maxnb;
        public double minb;
        public double minnb;
    }
    
    public static final class c
    {
        public long ce;
        public long cgte;
        public long clte;
        public long cne;
        public double ve;
        public double vgte;
        public double vlte;
        public double vne;
    }
}
