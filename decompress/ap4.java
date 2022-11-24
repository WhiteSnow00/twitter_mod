import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.app.collabs.search.CollaboratorsSearchViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ap4 extends pue implements stb<String, vzv>
{
    public final CollaboratorsSearchViewModel F0;
    public final fvh<String> G0;
    
    public ap4(final CollaboratorsSearchViewModel f0, final fvh<String> g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String value = (String)o;
        e0e.f((Object)value, "updatedQuery");
        this.G0.setValue((Object)value);
        ((MviViewModel)this.F0).O((sdw)new tp4(value));
        return vzv.a;
    }
}
