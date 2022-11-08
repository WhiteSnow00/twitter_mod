import org.json.JSONException;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cb8
{
    public static final sa4<cb8> f;
    public static final zml<cb8> g;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    
    static {
        cb8.f = new ag8(500);
        g = new zml();
    }
    
    public cb8(final long a, String b, String string, final String d, final boolean e) {
        this.a = a;
        this.b = b;
        while (true) {
            try {
                b = (string = new JSONObject(string).toString(2));
                this.c = string;
                this.d = d;
                this.e = e;
            }
            catch (final JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("\n");
        sb.append(this.c);
        return sb.toString();
    }
}
