import android.os.Build$VERSION;
import androidx.work.OverwritingInputMerger;
import androidx.work.c;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emj extends gtx
{
    public static final emj.emj$b Companion;
    
    static {
        Companion = new emj.emj$b();
    }
    
    public emj(final a a) {
        e0e.f((Object)a, "builder");
        super(a.b, a.c, (Set)a.d);
    }
    
    public static final class a extends gtx$a<a, emj>
    {
        public a(final Class<? extends c> clazz) {
            super((Class)clazz);
            super.c.d = OverwritingInputMerger.class.getName();
        }
        
        public final gtx c() {
            if (!super.a || Build$VERSION.SDK_INT < 23 || !super.c.j.c) {
                return new emj(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }
        
        public final gtx$a d() {
            return this;
        }
    }
}
