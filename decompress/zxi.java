import java.util.Map;
import com.twitter.notifications.settings.persistence.MissingSettingsDataException;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zxi
{
    public final dyi a;
    
    public zxi() {
        final fxp a = new fxp();
        this.a = (dyi)a;
    }
    
    public final n9q<cyi> a(final UserIdentifier userIdentifier) {
        final t3s a = mq1.a;
        long n = System.currentTimeMillis();
        final String s = null;
        String d = null;
        Label_0070: {
            Map c = null;
            try {
                c = this.a.c(userIdentifier);
                d = s;
                final zxi zxi = this;
                final dyi dyi = zxi.a;
                final UserIdentifier userIdentifier2 = userIdentifier;
                final String d2 = dyi.d(userIdentifier2);
                d = d2;
                final zxi zxi2 = this;
                final dyi dyi2 = zxi2.a;
                final UserIdentifier userIdentifier3 = userIdentifier;
                final long e = dyi2.e(userIdentifier3);
                n = e;
                d = d2;
                final Map map = c;
                break Label_0070;
            }
            catch (final MissingSettingsDataException ex) {
                final Map map = null;
            }
            try {
                final zxi zxi = this;
                final dyi dyi = zxi.a;
                final UserIdentifier userIdentifier2 = userIdentifier;
                final String d2 = d = dyi.d(userIdentifier2);
                final zxi zxi2 = this;
                final dyi dyi2 = zxi2.a;
                final UserIdentifier userIdentifier3 = userIdentifier;
                final long e = n = dyi2.e(userIdentifier3);
                d = d2;
                final Map map = c;
                return (n9q<cyi>)n9q.v((Object)new cyi(d, map, n));
            }
            catch (final MissingSettingsDataException ex2) {
                final Map map = c;
                return (n9q<cyi>)n9q.v((Object)new cyi(d, map, n));
            }
        }
    }
}
