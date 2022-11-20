import android.widget.Checkable;

// 
// Decompiled by Procyon v0.6.0
// 

public interface dng<T extends dng<T>> extends Checkable
{
    int getId();
    
    void setInternalOnCheckedChangeListener(final a<T> p0);
    
    public interface a<C>
    {
    }
}
