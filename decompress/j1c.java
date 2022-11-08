import android.os.Bundle;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j1c extends fr1
{
    public final v6w d;
    public final String e;
    public final Map<String, String> f;
    
    public j1c(final v6w d, final String e, final Map f, final Bundle bundle, final hg8 hg8) {
        super(bundle);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final String j() {
        return this.d.c;
    }
    
    public final String l() {
        return this.d.d;
    }
    
    public final int n() {
        return this.d.a;
    }
    
    public final tpv o() {
        return (tpv)this.d.b.invoke((Object)this.e, (Object)this.f);
    }
    
    public final boolean q() {
        return false;
    }
    
    public final String r() {
        return this.e;
    }
    
    public final s5p s() {
        return this.d.e;
    }
}
