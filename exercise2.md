# exercise2
## _Made by Stefan Jovic_

## Git comands

- **git config**
-- git config git config is a command that is used to set and view configuration options for a Git repository.
-- It can be used to configure both global and repository-specific settings.
-- Configuration options can include user information, default branch name, merge strategies etc.
-- git config can be modified with parameters such as --global to set global configuration options.
-- The --list option can be used to show all configuration options and their values.
-- Configuration options can be set locally, per user, or system-wide.
-- git config is used to customize Git to your specific needs and preferences.

- **git init**
-- git init initializes a new Git repository in the current working directory.
-- It creates a new .git directory that stores all the metadata and configuration information for the repository.
-- The metadata includes information about the commits, branches, and other objects in the repository.
-- git init can be modified with parameters such as --bare to create a bare repository without a working directory.
-- git init can be used to start a new repository from scratch or to reinitialize an existing repository.
-- After running git init, you can start adding files and making commits to the repository.

- **git commit**
-- git status displays the current state of the Git repository.
-- It shows which files have been modified and which files are staged for the next commit.
-- It shows both meta-information and file data.
-- git status can be modified with parameters such as -s for a short output and -l for a more detailed output.
-- The --ignored option shows the files that are ignored by Git.
-- git status can be used locally or on a remote server.
-- Changes can be made in different areas like the working directory or staging area.

- **git status**
--git status is a command that shows the current status of the Git repository.
-- It displays information about which files have been modified, which are staged for the next commit, and which are not tracked by Git.
-- git status can be modified with parameters such as --short to display output in a more concise format.
-- git status is used to check the status of your files and see which changes have been made since the last commit.
-- git status shows both the meta-information (such as which files are staged or not) and the actual data (the content of the files themselves).
-- Changes made locally can be staged and committed to the local repository, or pushed to a remote repository for collaboration with other users.

- **git add**
-- git add is a command that stages changes for the next commit in the Git repository.
-- It adds the changes to the staging area, which is a temporary storage area for changes before they are committed to the repository.
-- git add can be modified with parameters such as --all to stage all changes.
-- The command only affects the local repository where it's executed.
-- git add can be used to add both meta-information (such as file names and permissions) and the actual data (the content of the files).
-- Changes made locally can be staged and committed to the local repository, or pushed to a remote repository for collaboration with other users.

- **git log**
-- git log is a command that displays the commit history of a Git repository.
-- git log can be modified with parameters such as --pretty=format:"%h - %s (%an, %ar)" to customize the output format.
-- git log is used to review the history of changes made to the repository, and to understand what changes were made, when they were made, and who made them.
-- git log shows meta-information (such as the author, timestamp, and commit message) and the actual data (the content of the files) for each commit.
-- Changes made locally can be committed to the local repository, or pushed to a remote repository for collaboration with other users.

- **git diff**
-- git diff is a command that shows the differences between two versions of a file or between two commits in a Git repository.
-- git diff displays the changes made to the files in a patch format, showing the lines that were removed or added.
-- git diff can be modified with parameters such as --color-words to highlight changes word by word, or --ignore-whitespace to ignore changes in whitespace.
-- git diff shows the actual data (the content of the files) and not just the meta-information (such as author and timestamp) like git log.

- **git pull**
-- git pull is a Git command that updates a local repository with changes from a remote repository.
-- It performs two actions: first, it fetches the changes from the remote repository, and then it merges them with the local repository.
-- It can overwrite local changes if not used correctly.
-- git pull can be customized with additional parameters such as --no-commit to fetch the changes but not merge them automatically.
-- It updates the local repository and working directory, but it does not affect the remote repository or any other clones of the repository.

- **git push**
-- git push is a Git command that is used to upload local repository changes to a remote repository.
-- It is commonly used to share changes with collaborators or to update a remote repository hosted on a service such as GitHub or GitLab.
-- When running git push, the local repository changes are transferred to the remote repository and merged into the existing codebase.
git push can be customized with additional parameters such as --force to overwrite remote changes or --set-upstream to set the upstream branch to the current branch.
-- git push updates the remote repository with the local changes, but does not affect the local repository or working directory.
