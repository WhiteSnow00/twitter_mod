import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aav implements z9v
{
    public final gcu a;
    public final kcm b;
    public final r9a c;
    public final bxo d;
    public final u9v e;
    
    public aav(final gcu a, final kcm b, final r9a c, final bxo d, final u9v e) {
        e0e.f((Object)a, "twPreferences");
        e0e.f((Object)b, "releaseCompletable");
        e0e.f((Object)c, "errorReporter");
        e0e.f((Object)d, "ioScheduler");
        e0e.f((Object)e, "twitterBlueDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final <T> y9v<T> a(final gav<T> gav) {
        final String key = gav.getKey();
        final t5j filter = this.a.a().filter((ouk)new mr0((stb)new dav((gav)gav), 19));
        final boolean b = gav instanceof gav$a;
        t5j t5j;
        if (b) {
            t5j = filter.map((rtb)new uyn((stb)new bav((gav)gav), 26));
        }
        else {
            if (!(gav instanceof gav$b)) {
                throw new NoWhenBranchMatchedException();
            }
            t5j = filter.map((rtb)new w1n((stb)new cav((gav)gav), 26));
        }
        e0e.d((Object)t5j, "null cannot be cast to non-null type io.reactivex.Observable<T of com.twitter.subscriptions.preferences.TwitterBluePreferenceFactoryImpl.<get-observable>>");
        Serializable s;
        if (b) {
            s = this.a.e(gav.getKey(), (boolean)((gav$a)gav).a());
        }
        else {
            if (!(gav instanceof gav$b)) {
                throw new NoWhenBranchMatchedException();
            }
            s = this.a.g(gav.getKey(), (int)((gav$b)gav).a());
        }
        return new fav<T>(key, (t5j<Object>)t5j, s, (stb<? super Object, ? extends yz5>)new stb<T, yz5>(this, gav) {
            public final aav F0;
            public final gav<T> G0;
            
            public final Object invoke(final Object o) {
                e0e.f(o, "newValue");
                return this.F0.e.a((gav)this.G0, o);
            }
        }, this.b, this.d, this.c);
    }
}
