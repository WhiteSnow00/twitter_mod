import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgg extends DataSetObserver
{
    public final mgg a;
    
    public lgg(final mgg a) {
        this.a = a;
    }
    
    public final void onChanged() {
        ((zsj)this.a).Q0 = -1;
    }
    
    public final void onInvalidated() {
        ((zsj)this.a).Q0 = -1;
    }
}
