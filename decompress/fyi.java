import java.util.Map;
import com.twitter.notifications.settings.persistence.MissingSettingsDataException;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyi
{
    public final jyi a;
    
    public fyi() {
        final wxp a = new wxp();
        this.a = (jyi)a;
    }
    
    public final eaq<iyi> a(final UserIdentifier userIdentifier) {
        final m4s a = hq1.a;
        long n = System.currentTimeMillis();
        final String s = null;
        String d = null;
        Label_0075: {
            Map c = null;
            try {
                c = this.a.c(userIdentifier);
                d = s;
                final fyi fyi = this;
                final jyi jyi = fyi.a;
                final UserIdentifier userIdentifier2 = userIdentifier;
                final String d2 = jyi.d(userIdentifier2);
                d = d2;
                final fyi fyi2 = this;
                final jyi jyi2 = fyi2.a;
                final UserIdentifier userIdentifier3 = userIdentifier;
                final long e = jyi2.e(userIdentifier3);
                n = e;
                d = d2;
                final Map map = c;
                break Label_0075;
            }
            catch (final MissingSettingsDataException ex) {
                final Map map = null;
            }
            try {
                final fyi fyi = this;
                final jyi jyi = fyi.a;
                final UserIdentifier userIdentifier2 = userIdentifier;
                final String d2 = d = jyi.d(userIdentifier2);
                final fyi fyi2 = this;
                final jyi jyi2 = fyi2.a;
                final UserIdentifier userIdentifier3 = userIdentifier;
                final long e = n = jyi2.e(userIdentifier3);
                d = d2;
                final Map map = c;
                return (eaq<iyi>)eaq.v((Object)new iyi(d, map, n));
            }
            catch (final MissingSettingsDataException ex2) {
                final Map map = c;
                return (eaq<iyi>)eaq.v((Object)new iyi(d, map, n));
            }
        }
    }
}
