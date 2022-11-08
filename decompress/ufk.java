import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ufk extends twj<tfk>
{
    public final tfk a(final khe khe) throws IOException {
        final tfk f0 = tfk.F0;
        final HashMap hashMap = new HashMap();
        while (khe.i0() != lje.L0) {
            final String j = khe.j();
            khe.i0();
            if (khe.e() == lje.U0) {
                hashMap.put(j, null);
            }
            else {
                hashMap.put(j, this.a(khe));
            }
        }
        if (hashMap.isEmpty()) {
            return f0;
        }
        final String s = hashMap.entrySet().iterator().next().getKey();
        tfk d0 = tfk.D0;
        if (!s.equals("foursquare")) {
            final tfk e0 = tfk.E0;
            d0 = f0;
            if (s.equals("yelp")) {
                d0 = e0;
            }
        }
        return d0;
    }
}
