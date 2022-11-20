import android.view.View;
import android.view.ViewGroup;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c84 extends Property<ViewGroup, Float>
{
    public static final Property<ViewGroup, Float> a;
    
    static {
        c84.a = new c84();
    }
    
    public c84() {
        super((Class)Float.class, "childrenAlpha");
    }
    
    public final Object get(final Object o) {
        Float value = (Float)((View)o).getTag(2131430152);
        if (value == null) {
            value = 1.0f;
        }
        return value;
    }
    
    public final void set(final Object o, final Object o2) {
        final ViewGroup viewGroup = (ViewGroup)o;
        final float floatValue = (float)o2;
        ((View)viewGroup).setTag(2131430152, (Object)floatValue);
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
