import android.app.Activity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ubs<TResult>
{
    public ubs<TResult> a(final zgj zgj) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }
    
    public ubs<TResult> b(final Executor executor, final zgj zgj) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }
    
    public ubs<TResult> c(final ghj<TResult> ghj) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
    
    public abstract ubs<TResult> d(final kij p0);
    
    public abstract ubs<TResult> e(final Activity p0, final kij p1);
    
    public abstract ubs<TResult> f(final Executor p0, final kij p1);
    
    public abstract ubs<TResult> g(final akj<? super TResult> p0);
    
    public abstract ubs<TResult> h(final Activity p0, final akj<? super TResult> p1);
    
    public abstract ubs<TResult> i(final Executor p0, final akj<? super TResult> p1);
    
    public <TContinuationResult> ubs<TContinuationResult> j(final fo6<TResult, TContinuationResult> fo6) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }
    
    public <TContinuationResult> ubs<TContinuationResult> k(final Executor executor, final fo6<TResult, TContinuationResult> fo6) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }
    
    public <TContinuationResult> ubs<TContinuationResult> l(final fo6<TResult, ubs<TContinuationResult>> fo6) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
    
    public <TContinuationResult> ubs<TContinuationResult> m(final Executor executor, final fo6<TResult, ubs<TContinuationResult>> fo6) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
    
    public abstract Exception n();
    
    public abstract TResult o();
    
    public abstract <X extends Throwable> TResult p(final Class<X> p0) throws X, Throwable;
    
    public abstract boolean q();
    
    public abstract boolean r();
    
    public abstract boolean s();
    
    public <TContinuationResult> ubs<TContinuationResult> t(final str<TResult, TContinuationResult> str) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
    
    public <TContinuationResult> ubs<TContinuationResult> u(final Executor executor, final str<TResult, TContinuationResult> str) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
