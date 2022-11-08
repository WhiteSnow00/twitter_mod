import android.os.Build$VERSION;
import androidx.work.OverwritingInputMerger;
import androidx.work.c;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlj extends xrx
{
    public static final b Companion;
    
    static {
        Companion = new b();
    }
    
    public jlj(final a a) {
        zzd.f((Object)a, "builder");
        super(a.b, a.c, a.d);
    }
    
    public static final class a extends xrx.a<a, jlj>
    {
        public a(final Class<? extends c> clazz) {
            super(clazz);
            super.c.d = OverwritingInputMerger.class.getName();
        }
        
        @Override
        public final xrx c() {
            if (!super.a || Build$VERSION.SDK_INT < 23 || !super.c.j.c) {
                return new jlj(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }
        
        @Override
        public final xrx.a d() {
            return this;
        }
    }
    
    public static final class b
    {
    }
}
