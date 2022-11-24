import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import com.google.android.material.datepicker.c;
import android.content.Context;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n93
{
    public final l93 a;
    public final l93 b;
    public final l93 c;
    public final l93 d;
    public final l93 e;
    public final l93 f;
    public final l93 g;
    public final Paint h;
    
    public n93(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(kng.b(context, 2130970100, c.class.getCanonicalName()), lai.d1);
        this.a = l93.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.g = l93.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.b = l93.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.c = l93.a(context, obtainStyledAttributes.getResourceId(4, 0));
        final ColorStateList b = hog.b(context, obtainStyledAttributes, 6);
        this.d = l93.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.e = l93.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f = l93.a(context, obtainStyledAttributes.getResourceId(9, 0));
        (this.h = new Paint()).setColor(b.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
