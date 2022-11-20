// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003" }, d2 = { "Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime_release" }, k = 1, mv = { 1, 7, 1 })
public final class ComposeRuntimeError extends IllegalStateException
{
    public final String D0;
    
    public ComposeRuntimeError(final String d0) {
        czd.f((Object)d0, "message");
        this.D0 = d0;
    }
    
    @Override
    public final String getMessage() {
        return this.D0;
    }
}
