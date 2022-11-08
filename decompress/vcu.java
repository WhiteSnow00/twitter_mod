import com.twitter.util.user.UserIdentifier;
import android.net.Uri;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vcu extends dj1
{
    public vcu(final Intent intent, final o1a o1a) {
        super(intent);
    }
    
    public static final class a extends dj1.a<vcu, a>
    {
        public final Resources b;
        public boolean c;
        public long d;
        
        public a(final Resources b) {
            this.c = false;
            this.d = -1L;
            this.b = b;
        }
        
        public final Object i() {
            String s;
            if (this.c) {
                s = this.b.getString(2131959175, new Object[] { this.q(), String.valueOf(this.d) });
            }
            else if (dta.b().b("responsive_web_tweet_analytics_migration_enabled", false)) {
                s = this.b.getString(2131957333, new Object[] { this.q(), String.valueOf(this.d) });
            }
            else {
                s = this.b.getString(2131959134, new Object[] { String.valueOf(this.d) });
            }
            super.a.setData(Uri.parse(s));
            return new vcu(super.a, null);
        }
        
        public final boolean l() {
            final UserIdentifier o = ((dj1.a)this).o();
            final UserIdentifier undefined = UserIdentifier.UNDEFINED;
            boolean b = false;
            if (o == undefined && (this.c || dta.b().b("responsive_web_tweet_analytics_migration_enabled", false))) {
                return false;
            }
            if (this.d != -1L) {
                b = true;
            }
            return b;
        }
        
        public final String q() {
            if (((dj1.a)this).o() == UserIdentifier.UNDEFINED) {
                return null;
            }
            return ncw.b(((dj1.a)this).o()).b();
        }
    }
}
