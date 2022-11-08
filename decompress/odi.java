import com.twitter.util.forecaster.NetworkForecastChangedEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odi implements dca<NetworkForecastChangedEvent>
{
    public final qll<dw0> C0;
    
    public odi(final qll<mci> qll, final qll<dw0> c0) {
        this.C0 = c0;
        xw0.c((rj)new isf((Object)this, (Object)qll, 2));
    }
    
    public void onEvent(final NetworkForecastChangedEvent networkForecastChangedEvent) {
        final jci jci = new jci(networkForecastChangedEvent);
        final StringBuilder sb = new StringBuilder();
        sb.append(jci);
        sb.append(" -- will inform RequestController");
        g9g.a("NetworkRequestRetryObs", sb.toString(), "ANDROID-10803");
        ((dw0)this.C0.get()).c(jci);
    }
}
