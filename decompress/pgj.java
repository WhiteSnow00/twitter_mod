import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pgj
{
    public boolean a;
    public CopyOnWriteArrayList<fg3> b;
    
    public pgj(final boolean a) {
        this.b = new CopyOnWriteArrayList<fg3>();
        this.a = a;
    }
    
    public abstract void a();
}
