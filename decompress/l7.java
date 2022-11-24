import com.twitter.business.model.AboutModuleGoogleData;
import java.util.Objects;
import com.twitter.profilemodules.model.business.CountryIso;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l7
{
    public static final a Companion;
    
    static {
        Companion = new a();
        Objects.requireNonNull(CountryIso.Companion);
        CountryIso.access$getUS_ISO$cp();
    }
    
    public static final class a
    {
        public final CountryIso a() {
            Objects.requireNonNull(CountryIso.Companion);
            final String b = g6s.b();
            e0e.e((Object)b, "getDeviceCountryCode()");
            return new CountryIso(b, (wg8)null);
        }
        
        public final AboutModuleGoogleData b() {
            return new AboutModuleGoogleData(true, (String)null);
        }
    }
}
