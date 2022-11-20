import com.twitter.util.forecaster.NetworkForecastChangedEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lci
{
    public final NetworkForecastChangedEvent a;
    
    public lci(final NetworkForecastChangedEvent a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Network condition changed from ");
        j.append(this.a.a);
        j.append(" to ");
        j.append(this.a.b);
        return j.toString();
    }
}
