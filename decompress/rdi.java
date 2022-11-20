import com.twitter.util.forecaster.NetworkForecastChangedEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rdi implements lba<NetworkForecastChangedEvent>
{
    public final dml<xv0> D0;
    
    public rdi(final dml<oci> dml, final dml<xv0> d0) {
        this.D0 = d0;
        rw0.c((oj)new et1((Object)this, (Object)dml, 2));
    }
    
    public void onEvent(final NetworkForecastChangedEvent networkForecastChangedEvent) {
        final lci lci = new lci(networkForecastChangedEvent);
        final StringBuilder sb = new StringBuilder();
        sb.append(lci);
        sb.append(" -- will inform RequestController");
        w8g.a("NetworkRequestRetryObs", sb.toString(), "ANDROID-10803");
        ((xv0)this.D0.get()).c(lci);
    }
    
    public /* bridge */ void onEvent(final Object o) {
        this.onEvent((NetworkForecastChangedEvent)o);
    }
}
