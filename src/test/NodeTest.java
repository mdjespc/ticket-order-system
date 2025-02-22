package test;

import model.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testGetId() {
        assertAll(() -> new Node<Object>().getKey());
    }

    @Test
    void testGetValue() {
        Object value = new Object();
        Node<Object> node = new Node<>(value);
        assertEquals(node.getValue(), value);
    }

    @Test
    void testSetValue() {
        Object oldValue = new Object();
        Node<Object> node = new Node<>(oldValue);

        Object newValue = new Object();
        node.setValue(newValue);

        assertEquals(node.getValue(), newValue);
    }

    @Test
    void testTwoNodesAreEqualIfTheyAreEquivalent() {
        Object value = new Object();
        Node<?> node = new Node<>(value);
        Node<?> otherNode = new Node<>(value);

        assertEquals(otherNode, node);
    }

    @Test
    void testToString() {
        assertAll(() -> new Node<Object>(new Object()).toString());
    }

    @Test
    void testIntegerValueToString(){
        assertEquals("0", new Node<Integer>(0).toString());
    }

    @Test
    void testDoubleValueToString(){
        assertEquals("0.01", new Node<Double>(0.01).toString());
    }

    @Test
    void testStringValueToString(){
        assertEquals("test", new Node<String>("test").toString());
    }

    @Test
    void testBooleanValueToString(){
        assertEquals("true", new Node<Boolean>(true).toString());
    }

    @Test
    void testCloneIsEquivalentToOriginal() throws CloneNotSupportedException {
        Node<?> node = new Node<>(new Object());
        var clone = node.clone();

        assertEquals(node, clone);
    }

    @Test
    void testCloneIsNotIdenticalToOriginal() throws CloneNotSupportedException{
        Node<?> node = new Node<>(new Object());
        var clone = node.clone();

        assertNotSame(clone, node);
    }
}