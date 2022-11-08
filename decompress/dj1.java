import android.content.ComponentName;
import android.app.Activity;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class dj1 implements zm
{
    private static final String ARG_OWNER_ID = "ActivityStarter_owner_id";
    public final Intent mIntent;
    
    public dj1() {
        this(new Intent());
    }
    
    public dj1(Intent mIntent) {
        if (!yvj.a(mIntent)) {
            mIntent = new Intent();
        }
        this.mIntent = mIntent;
    }
    
    public static dj1 fromIntent(final Intent intent) {
        return new dj1(intent);
    }
    
    public final UserIdentifier getOwner() {
        return yvj.i(this.mIntent, "ActivityStarter_owner_id");
    }
    
    @Deprecated
    @Override
    public final Intent toIntent(final Context context, final Class<? extends Activity> clazz) {
        if (clazz == null) {
            return this.mIntent;
        }
        return this.mIntent.setComponent(new ComponentName(context, (Class)clazz));
    }
    
    public abstract static class a<A extends dj1, B extends a> extends h4j<A>
    {
        public final Intent a;
        
        public a() {
            this.a = new Intent();
        }
        
        public a(final Intent intent) {
            Intent a;
            if (intent != null) {
                a = new Intent(intent);
            }
            else {
                a = new Intent();
            }
            this.a = a;
        }
        
        public final UserIdentifier o() {
            return yvj.i(this.a, "ActivityStarter_owner_id");
        }
        
        public final B p(final UserIdentifier userIdentifier) {
            if (userIdentifier != null) {
                this.a.putExtra("ActivityStarter_owner_id", userIdentifier.getId());
            }
            else {
                this.a.removeExtra("ActivityStarter_owner_id");
            }
            final int a = w4j.a;
            return (B)this;
        }
    }
}
