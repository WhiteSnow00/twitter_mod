import java.util.List;
import j$.util.Map$_EL;
import java.util.LinkedHashMap;
import android.view.ViewGroup;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e94
{
    public static final b Companion;
    public final Map<Integer, ypa<Context, ViewGroup>> a;
    public final itb<Context, ypa<Context, ViewGroup>, Integer, brk<ViewGroup>> b;
    public final Map<Integer, brk<ViewGroup>> c;
    public final n4s d;
    public final n4s e;
    public final n4s f;
    
    static {
        Companion = new b();
    }
    
    public e94(final Map<Integer, ? extends ypa<Context, ViewGroup>> a) {
        final e94$a b = new e94$a((Object)e94.Companion);
        this.a = (Map<Integer, ypa<Context, ViewGroup>>)a;
        this.b = (itb<Context, ypa<Context, ViewGroup>, Integer, brk<ViewGroup>>)b;
        this.c = new LinkedHashMap();
        this.d = (n4s)pps.n((nsb)h94.D0);
        this.e = (n4s)pps.n((nsb)g94.D0);
        this.f = (n4s)pps.n((nsb)i94.D0);
    }
    
    public final brk<ViewGroup> a(final Context context, final int n) {
        final ypa ypa = this.a.get(n);
        if (ypa == null) {
            return null;
        }
        brk brk;
        if (context == null) {
            brk = (brk)Map$_EL.getOrDefault((Map)this.c, (Object)n, (Object)null);
        }
        else {
            final LinkedHashMap c = this.c;
            final Integer value = n;
            Object value2;
            if ((value2 = c.get(value)) == null) {
                value2 = this.b.h0((Object)context, (Object)ypa, (Object)((Number)this.f.getValue()).intValue());
                c.put(value, value2);
            }
            brk = (brk)value2;
        }
        return (brk<ViewGroup>)brk;
    }
    
    public final boolean b(final int n) {
        final boolean booleanValue = (boolean)this.d.getValue();
        boolean b = false;
        if (!booleanValue) {
            return false;
        }
        final Object value = this.e.getValue();
        czd.e(value, "<get-isChromeTypeEnabledList>(...)");
        if (!((List)value).contains("-1")) {
            final Object value2 = this.e.getValue();
            czd.e(value2, "<get-isChromeTypeEnabledList>(...)");
            if (!((List)value2).contains(String.valueOf(n))) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public static final class b
    {
    }
}
