import android.os.BaseBundle;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Map;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eem extends sd
{
    public static final Parcelable$Creator<eem> CREATOR;
    public Bundle F0;
    public Map<String, String> G0;
    
    static {
        CREATOR = (Parcelable$Creator)new fem();
    }
    
    public eem(final Bundle f0) {
        this.F0 = f0;
    }
    
    public final Map<String, String> p() {
        if (this.G0 == null) {
            final Bundle f0 = this.F0;
            final ws0 g0 = new ws0();
            for (final String s : ((BaseBundle)f0).keySet()) {
                final Object value = ((BaseBundle)f0).get(s);
                if (value instanceof String) {
                    final String s2 = (String)value;
                    if (s.startsWith("google.") || s.startsWith("gcm.") || s.equals("from") || s.equals("message_type") || s.equals("collapse_key")) {
                        continue;
                    }
                    g0.put((Object)s, (Object)s2);
                }
            }
            this.G0 = g0;
        }
        return this.G0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.g1(parcel, 2, this.F0);
        xd.B1(parcel, x1);
    }
}
