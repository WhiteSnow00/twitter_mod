// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profiles.animation;

import android.graphics.drawable.Drawable;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.util.AttributeSet;
import android.content.Context;

public class BalloonSetAnimationView extends ibb
{
    public static final float[] G0;
    
    static {
        G0 = new float[] { 1.0f, 0.9f, 0.8f };
    }
    
    public BalloonSetAnimationView(final Context context, final AttributeSet set) {
        super(context, set, 0);
    }
    
    public void setOwner(final UserIdentifier userIdentifier) {
    }
    
    public void setProfileUser(final jgl jgl) {
    }
    
    public static final class a implements b$a
    {
        public final List<Drawable> a;
        public int b;
        public int[] c;
        
        public a(final krm krm) {
            this.c = new int[] { 2131232795, 2131232796, 2131232797, 2131232798, 2131232799 };
            final rif h = rif.H();
            final int[] c = this.c;
            for (int length = c.length, i = 0; i < length; ++i) {
                h.p((Object)krm.j(c[i]));
            }
            this.a = (List)((n4j)h).e();
        }
    }
}
