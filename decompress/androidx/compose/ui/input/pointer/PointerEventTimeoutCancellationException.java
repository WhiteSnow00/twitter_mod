// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003" }, d2 = { "Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class PointerEventTimeoutCancellationException extends CancellationException
{
    public PointerEventTimeoutCancellationException(final long n) {
        super(jg9.s("Timed out waiting for ", n, " ms"));
    }
}
