import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pof implements hzf
{
    public static final pof a;
    
    static {
        a = new pof();
    }
    
    public final Object a(final Object o, final Object o2, final Object o3) {
        final LiveEventConfiguration liveEventConfiguration = (LiveEventConfiguration)o;
        final hvf hvf = (hvf)o2;
        final i1 e = (i1)o3;
        final hi2 hi2 = new hi2(hvf, liveEventConfiguration);
        ((d0x)hi2).e = e;
        final int a = c5j.a;
        ((d0x)hi2).c = true;
        return hi2;
    }
}
