# BinarySearchTreePrinter

* **Objective** - To create a class which
    * prints the contents of a `BinarySearchTree` in-order
    * prints the contents of a `BinarySearchTree` pre-order
    * prints the contents of a `BinarySearchTree` post-order
* Ensure that all test cases in `com.github.curriculeon` pass with 100% success rate.


## Description

### What is a `BinarySearchTreeNode`?

* A `BinarySearchTreeNode` is a type of binary tree node with an additional property.
* The additional property `BinarySearchTreeNode` has is that values in the left subtree of any given node are less than the value of that node, and the values in the right subtree of any given node are greater than the value of that node.
* This property is known as the "binary search tree property" and is often used in algorithms for searching, sorting, and indexing data.
* In Java, a typical implementation of a `BinarySearchTreeNode` has
    * a key (_which is usually used for sorting and searching_)
    * a value (_which represents the data associated with the key_)
    * a left child pointer (_which point to the left children of the node in the binary search tree_).
    * a right child pointer (_which point to the left children of the node in the binary search tree_).
* The left and right children of a `BinarySearchTreeNode` must also be `BinarySearchTreeNodes` themselves, so that the binary search tree property is maintained throughout the tree.

### What is a `BinarySearchTree`?

* A `BinarySearchTree` is a type of binary tree that is built using `BinarySearchTreeNode`s.
* As the name suggests, it is a tree-based data structure that allows for efficient searching of elements in the tree.
* A binary search tree has the property that for each node, all nodes in its left subtree have keys less than its own key, and all nodes in its right subtree have keys greater than its own key.
* This allows for efficient search and insertion operations, as the search can be performed by comparing the key being searched for to the keys at each node, and descending down the tree until the key is found or the search reaches a leaf node.
* In addition to search and insertion, binary search trees also support other operations such as deletion, minimum and maximum key retrieval, and finding the predecessor and successor of a given key.
* In Java, a typical implementation of a `BinarySearchTree` would have a reference to the root node of the tree, and methods to perform the various operations mentioned above, typically implemented recursively.


### When is a `BinarySearchTree` used?

* A `BinarySearchTree` is often used in situations where we need to efficiently `search`, `insert`, `delete`, and `retrieve` elements from a collection of data, and where the data can be naturally ordered according to some key.
* The binary search tree is particularly useful when the data is dynamic, meaning that elements can be added or removed from the collection at any time, as the binary search tree is designed to efficiently handle such changes while maintaining the order of the elements.
* Some examples of where a binary search tree might be used include:
    * Indexing in databases and file systems, where the index can be built as a binary search tree for efficient searching and retrieval of data.
    * Implementing associative arrays, where the keys are the elements to be stored and the values are the associated data.
    * Implementing sets and maps, where the order of the elements is important and operations such as insertion, deletion, and search need to be performed efficiently.
* Overall, the `BinarySearchTree` is a useful data structure for a wide range of applications where fast `search`, `insertion`, and `retrieval` of ordered data is required.




## How to Download

#### Part 1 - Forking the Project
* To _fork_ the project, click the `Fork` button located at the top right of the project.


#### Part 2 - Navigating to _forked_ Repository
* Navigate to your github profile to find the _newly forked repository_.
* Copy the URL of the project to the clipboard.

#### Part 3 - Cloning _forked_ repository
* Clone the repository from **your account** into the `~/dev` directory.
    * if you do not have a `~/dev` directory, make one by executing the following command:
        * `mkdir ~/dev`
    * navigate to the `~/dev` directory by executing the following command:
        * `cd ~/dev`
    * clone the project by executing the following command:
        * `git clone https://github.com/MYUSERNAME/NAMEOFPROJECT`

#### Part 4 - Check Build
* Ensure that the tests run upon opening the project.
    * You should see `Tests Failed: 99 of 99 tests`







## How to Submit

#### Part 1 -  _Pushing_ local changes to remote repository
* from a _terminal_ navigate to the root directory of the _cloned_ project.
* from the root directory of the project, execute the following commands:
    * add all changes
        * `git add .`
    * commit changes to be pushed
        * `git commit -m 'I have added changes'`
    * push changes to your repository
        * `git push -u origin master`

#### Part 2 - Submitting assignment
* from the browser, navigate to the _forked_ project from **your** github account.
* click the `Pull Requests` tab.
* select `New Pull Request`
