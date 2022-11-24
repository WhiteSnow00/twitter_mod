import android.content.ComponentName;
import android.app.Activity;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class aj1 implements cn
{
    private static final String ARG_OWNER_ID = "ActivityStarter_owner_id";
    public final Intent mIntent;
    
    public aj1() {
        this(new Intent());
    }
    
    public aj1(Intent mIntent) {
        if (!swj.a(mIntent)) {
            mIntent = new Intent();
        }
        this.mIntent = mIntent;
    }
    
    public static aj1 fromIntent(final Intent intent) {
        return new aj1(intent);
    }
    
    public final UserIdentifier getOwner() {
        return swj.i(this.mIntent, "ActivityStarter_owner_id");
    }
    
    @Deprecated
    public final Intent toIntent(final Context context, final Class<? extends Activity> clazz) {
        if (clazz == null) {
            return this.mIntent;
        }
        return this.mIntent.setComponent(new ComponentName(context, (Class)clazz));
    }
    
    public abstract static class a<A extends aj1, B extends a> extends z4j<A>
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
            return swj.i(this.a, "ActivityStarter_owner_id");
        }
        
        public final B p(final UserIdentifier userIdentifier) {
            if (userIdentifier != null) {
                this.a.putExtra("ActivityStarter_owner_id", userIdentifier.getId());
            }
            else {
                this.a.removeExtra("ActivityStarter_owner_id");
            }
            final int a = o5j.a;
            return (B)this;
        }
    }
}
