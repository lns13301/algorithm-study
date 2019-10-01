import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeTest {

    @Test
    public void CreatedTest() {
        BinaryTree btree = new BinaryTree();
        assertThat(btree).isNotNull();
    }

}