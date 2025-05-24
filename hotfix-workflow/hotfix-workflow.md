
```
This document outlines the standardized workflow for managing critical bug fixes in the production codebase using Git. The hotfix process ensures that urgent issues are addressed quickly and efficiently, while maintaining code integrity and smooth integration with ongoing development. Following this workflow helps teams maintain a clean and stable production environment, minimize downtime, and keep development branches up to date with the latest fixes.
```

# Hotfix Branch Workflow (Git Environment)

## Step 1:
Receive notification to fix a critical bug in production.  
Update your local master with the latest remote master commits:

git pull origin master

## Step 2:
Create and switch to a new hotfix branch based on the updated local master:

git checkout -b hotfix master

## Step 3:
Use your preferred text editor (e.g., nano) to fix the bug in the hotfix branch.  
Communicate with developers if needed. Save and exit.

## Step 4:
Stage and commit your changes locally:

git add .
git commit -m "Bug has been resolved successfully"

Push your hotfix branch to the remote repository (to a separate remote branch, **not** master):

git push origin hotfix:remote-branch-name

Then, create a pull request from `hotfix` to `master` on the remote repository for review and merging.

## Step 5:
Once the pull request is reviewed and merged into remote master, update your local master:

git checkout master
git pull origin master

## Step 6:
Switch back to your develop branch to continue working:

git checkout develop

Rebase develop on the updated master to get the latest bug fixes:

git rebase master

## Step 7:
Now, deploy the updated code to various testing environments outside the Git environment to verify the fix.
