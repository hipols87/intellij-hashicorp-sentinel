package com.github.tylersmith34.intellijhashicorpsentinel;

import com.intellij.lang.ParserDefinition;
import com.intellij.testFramework.ParsingTestCase;
import com.intellij.testFramework.TestDataPath;
import org.jetbrains.annotations.NotNull;

@TestDataPath("$CONTENT_ROOT/test/test-data/psi/")
public class SentinelParserTest extends ParsingTestCase {
    protected SentinelParserTest(@NotNull String dataPath, @NotNull String fileExt, @NotNull ParserDefinition... definitions) {
        super(dataPath, fileExt, definitions);
    }

    public SentinelParserTest() {
        this("psi", "sentinel", new SentinelParserDefinition());
    }

    protected void doTest() {
        doTest(true);
    }

    //    public void testArrayTailComment() throws Exception {
//        doTest();
//    }
    public void testImport() throws Exception {
        doTest();
    }

    public void testParam() throws Exception {
        doTest();
    }

    public void testParamWithDefault() throws Exception {
        doTest();
    }

    public void testGlobalVariable() throws Exception {
        doTest();
    }

    public void testEmptyFunction() throws Exception {
        doTest();
    }

    public void testFunctionWithReturn() throws Exception {
        doTest();
    }

    public void testFunctionWithVarAndReturn() throws Exception {
        doTest();
    }
}
