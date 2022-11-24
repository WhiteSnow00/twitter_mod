import java.util.List;
import java.util.Iterator;
import com.google.gson.JsonIOException;
import com.google.gson.Gson;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjl
{
    public static final String a(final a a) {
        try {
            final kkg t = kkg.t();
            for (final zvj zvj : a.a()) {
                final Object a2 = ((z2j)zvj).a;
                vmw.g(a2);
                final Object b = ((z2j)zvj).b;
                vmw.g(b);
                t.w(a2, b);
            }
            return new Gson().h((Object)kkg.o((Object)a.getKey(), ((z4j)t).e()));
        }
        catch (final JsonIOException ex) {
            r9a.d((Throwable)ex);
            return null;
        }
    }
    
    public interface a
    {
        List<zvj<String, ?>> a();
        
        String getKey();
    }
}
